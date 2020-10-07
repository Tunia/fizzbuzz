(1..69).each{|peepee|
	poopoo = ''
	poopoo += 'Fizz' if peepee % 3 == 0
	poopoo += 'Buzz' if peepee % 5 == 0
	puts(poopoo.empty? ? peepee : poopoo)
}
