# PERSISTENT LITTLE BUGGER

I essentially had to create a function that receives an integer (**num**) and “dismembers” a given number in one digit each and then multiply each other until the result is a number compound by only one digit. Numbers that are less than 10 already have only one digit to it, so it wasn’t needed further operations, hence why the first if returns zero. I then initialized two integers, one in which would contain the new number (**newNum**), and the other would be a type of assistant (**holder**). The do while is to precisely “dismember” the given number — when I make the operation _[num % 10]_, it takes the last number of the right, since you can always multiply the first digit by ten and the rest will be the second digit. After that, I had to update the new number _(newNum)_ that had just been given to the _holder_ variable, and then divide the integer _num_ by ten so I could get the first digit of it, but all that only while the number has two digits.