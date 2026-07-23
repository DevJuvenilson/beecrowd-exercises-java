beecrowd | 2473
Lottery
By OBI - Olimpíada Brasileira de Informática 2014 BR Brazil

Timelimit: 1
Flavinho knows that the chance of winning the lottery is very small. He loves studying probability! But, precisely because he understands probabilities, Flavinho follows the saying, “nothing ventured, nothing gained!”, and plays every week.

In his favorite lottery, the player bets six numbers between 1 and 99. In the draw, six winning numbers between 1 and 99 are also chosen. Those who match 3, 4, 5, or 6 numbers win as a prize, respectively, a “terno”, a “quadra”, a “quina”, or a “sena”.

In this task, you must write a program that says which prize Flavinho won, given the six numbers he bet and the six numbers that were drawn.

Input
The input consists of only two lines. The first line gives six distinct integers between 1 and 99, representing Flavinho's bet. The second line contains the six distinct integers drawn.

Output
Your program should print a line containing a word: “terno”, “quadra”, “quina”, or “sena”; if Flavinho matched, respectively, 3, 4, 5, or 6 numbers. If he matched fewer than 3 numbers, print the word “azar”.

Input Samples	Output Samples
34 55 77 12 23 99
5 3 77 55 42 34

terno

22 41 9 71 88 4
41 9 88 71 4 22

sena

25 51 53 17 19 87
23 33 1 2 81 92

azar