# sortingBalls
Exercise Sorting Balls

Source:
http://codekata.com/kata/kata11-sorting-it-out/

Assumptions made based on problem description:
* Input values are Integer;
* No validation is made to the size of integer or negative values. Positive values are assumed.
* Only 6 values are inputed through System.in

Solution Explained:
* Consume input through java.util.Scanner
* Use java.util.Vector to store/manipulate data
* Auxiliary method insertInOrder
  * Arguments:
    * Integer to be inserted
    * Vector to insert it to
  * Return:
    * Return ordered Vector with inserted integer
* After scan of input with sorting at each iteration, cast to array and print it in one line.
