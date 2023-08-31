# Java-DSA
It is a Java DSA notes

# Data Structures 
----------------
1. It is a way to organize data.
2. After organizing data it becomes easy to process it.
Given and Example:-
In a library if all books are unorganized and someone asks us to bring a book with a 
specific author name it will be very difficult for us to find that book.
However, in the same situation if all books are organized in naming order then it would 
be quite easy for us to find that book.
So, that's why Data Structures are important in real life.

# Types Of Data Structures
--------------------------
So generally there are two types of Data Structures:-
1. Linear Data Structures :-
   This type of Data Structure has data arranged in a sequential manner, and they are
   arranged sequentially so each element is connected with next element, as they are
   connected sequentially it becomes easy to traverse them and usually the traversal is
   on single level.
   Examples:- Array, LinkedList, Stack and Queue etc.
2. Non-Linear Data Structures:-
   This Data Structures are not arranged in sequential manner, and they are connected
   with one another through different paths, apart from Linear Data Structures these 
   are stored on multi level and as they are multi level so in order traverse each and 
   every element in non-linear data structures takes some amount and difficult then 
   linear data structures.
   Examples:- Tree, Graph etc.

# Analysis of Algorithms
------------------------
1. An algorithm is a set of instructions to perform a task or to solve a given problem.
2. There are several different algorithms to solve a given problem.
3. Analysis of algorithm deals in finding the best algorithm which runs fast and takes 
less memory.
Example:- 
Ramesh                                         Suresh
public int findSum(int n) {                    public int findSum(int n) {
    return n * (n + 1) / 2;                        int sum = 0;
}                                                  for(int i = 0; i <= n; i++) {
                                                       sum = sum + i; 
                                                   }
                                                   return sum;
                                               }

To Determine which algorithm is much efficient we have to identify these two:-
# Time complexity
1. It's an amount of time taken by algorithm to execute.
2. The input processed by an algorithm helps in to determine the time complexity.
3. So based on above algorithm to find sum of n numbers we can say the first algorithm of
Ramesh will take less time than Suresh as it will use a mathematical formula to
calculate whereas in Suresh's algorithm it will take more time than the first one because
it will loop through the number and add number into sum value until loop ends.
Eg:- time_complexity.TimeComplexityDemo.java

# Space Complexity
1. It's an amount of memory or space taken by algorithm to run.
2. The memory required to process the input by an algorithm helps to determine the space
complexity.
3. To determine Time and Space Complexity of an algorithm we use different 
mathematical methods which we will learn in Asymptotic Analysis of an algorithms.

# Asymptotic Analysis of an Algorithm
-------------------------------------
1. Asymptotic analysis helps in evaluating performance of an algorithm in terms of input 
size and its increase.
2. Using Asymptotic analysis we don't measure actual running time of an algorithm.
3. It helps in determining how time and space taken by algorithm increases with input 
size.
4. And when we perform this analysis there are certain notations that we use and those 
are Asymptotic Notations.

# Asymptotic Notations
----------------------
Asymptotic notations are the mathematical tools used to describe the running time of an
algorithm in terms of input size.
Example:- Performance of a car in 1 ltr of petrol.
Suppose if we went to purchase a car in a showroom and ask the dealer same question
above he may provide these different answers:-
    Highway it can give (where traffic is less) - 25km/ltr
    City (where traffic is high) - 15km/ltr
    City + Highway (avg traffic) - 20km/ltr

In the same we cannot determine the correct time and space but, we can use Asymptotic
notations to determine the similar :-
1. Best Case
2. Average Case
3. Worst Case

# Types of Asymptotic Notations
There are three notations for performing runtime analysis of an algorithm :-
1. Omega(Ω) Notation.
2. Big O(O) Notation.
3. Theta(θ) Notation.

# Omega(Ω) Notation
1. It is the formal way to express the lower bound of an algorithm's execution time.
2. Lower bound means for any given input this notation determines best amount of time
an algorithm can take to complete.
3. For example:- 
    If we say a certain algorithm takes 100 secs as best amount of time. So, 100 secs
    will be lower bound of that algorithm.
    The algorithm can take more than 100 secs but, it will not take less than 100 secs.
4. It provides the best case analysis of an algorithm.

# Big O(O) Notation
1. It is the formal way to express the upper bound of an algorithm's execution time.
2. Upper bound means for any given input this notation determines longest amount of 
time an algorithm can take to complete.
3. For example:-
   If we say certain algorithm takes 100 secs as longest amount of time. So, 100 secs 
   will be upper bound of that algorithm. The algorithm can take less than 100 secs
   but, it will not take more than 100 secs.
4. It provides the worst case analysis of an algorithm.

# Theta(θ) Notation 
1. It is the formal way to express both the upper and lower bound of an algorithm's 
execution time.
2. By Lower and Upper bound means for any given input this notation determines average 
amount of time an algorithm can take to complete.
3. For example:-
   If we execute a certain algorithm, and it takes 100 secs for first execution, 120 secs
   for second execution, 110 secs for third execution and so on. So, theta notation 
   gives an average of running time of that algorithm.
4. It provides the average case analysis of an algorithm.

# Rules of Big O(O) Notation
----------------------------
1. It's a single processor.
2. It performs sequential execution of statements.
3. Assignment operation takes 1 unit of time.
4. Return statement takes 1 unit of time.
5. Arithmetical operation takes 1 unit of time.
6. Logical operation takes 1 unit of time.
7. Other small/single operation takes 1 unit of time.
8. Drop lower order terms, Example:- T = n^2 + 3n + 1 ===> O(n^2)
9. Drop constant multipliers, Example:- T = 3n^2 + 6n + 1 ===> O(n^2)

# Array Data Structure
----------------------
1. An array is a collection of homogeneous elements of specified type.
2. All elements have contiguous memory locations.
3. Each partition has two neighbours except first and last one.
4. Size of array is fixed and cannot be modified once it is created.
5. Being adjacent each element is indexed and can be determined by its position.
6. Index starts at 0 and for (one dimensional array) ends at [length - 1]