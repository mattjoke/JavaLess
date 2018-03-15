# Reference (or how to use JavaLess)


## Instalation
I decided export JavaLess to jar file, because it can be easily exported/imported, but I won't update JAR file until I make some big changes. You can easily download/clone and export for yourself (e.g. beta changes).
The lastest official release: https://goo.gl/oG5qoh

Download that Jar and import it to your new project.
#### How?
It's easy to do :). When creating new project click instead of finish to next, and on the Libraries tab select "Add External JARs". And then hit Finish.

#### What else?
It's ready to use in your project. Only one thing is necessary. You need to **extend** your main java project and also import JavaLess Package (Ctrl+Shift+O).
For example: 

public class name **extends JavaLess** .... 

## Constants
**PI** - returns value of Pi

**HALF_PI** - returns Pi/2

**QUARTER_PI** - returns Pi/4

**TWO_PI** - returns 2 * Pi

## Methods

#### Priting
	-printing is shorter, but with same functionalities, e.g. println() = System.out.println()

**println(Object o)** - prints value on console - \n

**print(Object o)** - prints value on console - without \n

**println(int/long/double/float [] arr)** - prints whole array on console

#### Sorts
**sort(int[] arr)** - sorts using bubble sort

**sort(int[] arr, boolean choice)** - sorts using bubble sort, when choice is true, sort is in ascending order, when false, sort is in descending order

**selectionSort(int[] array, boolean choice)** - sorts using selection sort, when choice is true, sort is in ascending order, when false, sort is in descending order

**insertionsort(int[] arr)** - sorts using insertion sort

**insertionsort(int[] arr, boolean choice)** - sorts using insertion sort, when choice is true, sort is in ascending order, when false, sort is in descending order

#### Math
	- when talking about number, I usually mean float,double,int or long

**abs(number)** - returns absolute number

**round(number,choice)** - rounds number, when true, returned number is higher than number inputed(e.g. 5.25 -> 6.0). When false, returned number is lower than inputed number (e.g. 5.64 -> 5.0).

**ceil(number)** - always returns higher or equal number

**floor(number)** - converts from float/double to int

**log(number)** - returns natural logarithm 

**log10(number)** - returns logarithm with base 10

**pow(number, power)** - returns number powered on second number

**sq(number)** - returns squared number

**sqrt(number)** - returns square root of number