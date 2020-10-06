module Fizz where

import System.Environment

fizz :: Int -> [String]
fizz n = take n [stringify x | x <- [1..]]
  where
    stringify :: Int -> String
    stringify i
      | i `mod` 15 == 0 = "FizzBuzz"
      | i `mod` 3 == 0  = "Fizz"
      | i `mod` 5 == 0  = "Buzz"
      | otherwise       = show i


main :: IO ()
main = do
  args <- getArgs
  case args of
    [i] -> print $ fizz (read i)
    _   -> fail "NaN"
