module Fizz where

import System.Environment

buzz :: Int -> [String]
buzz i = [if r == "" then show x else r | x <- [1 .. i], let r = go preds x]
  where
    preds :: [(Int, String)]
    preds = [(3, "Fizz"), (5, "Buzz"), (15, "FizzBuzz")]
    go :: [(Int, String)] -> Int -> String
    go tuples x = foldl (\res (n, str) -> if x `mod` n == 0 then res ++ str else res ++ "") "" tuples

main :: IO ()
main = do
  args <- getArgs
  case args of
    [i] -> print $ buzz (read i)
    _   -> fail "NaN"
