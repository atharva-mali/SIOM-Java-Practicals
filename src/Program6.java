public class Program6 {
}

/*
6. The following code creates one array and one string object. How many
references to those objects exist after the code executes? Is either
object eligible for garbage collection?
...
String[] students = new String[10];
String studentName = "Peter Parker";
students[0] = studentName;
studentName = null;
...


=====================================================================================
Let's break down the code and analyze the number of references and whether the objects are eligible for garbage collection:

        1. `String[]students=new String[10];`
        -This line creates an array of `String` objects called `students` with a length of 10.It initializes each element in the array to `null`.So,you have an array with 10references to `null` strings.

        2. `String studentName="Peter Parker";`
        -This line creates a `String` object with the value"Peter Parker"and assigns a reference to it to the variable `studentName`.Now,you have one reference to the"Peter Parker"string.

        3. `students[0]=studentName;`
        -This line assigns the reference stored in `studentName` to the first element of the `students` array.Now, `students[0]` holds a reference to the"Peter Parker"string.

        4. `studentName=null;`
        -This line assigns `null` to the `studentName` variable.This means that the variable `studentName` no longer holds a reference to the"Peter Parker"string.

        After the code execution:

        - `students[0]` holds a reference to the"Peter Parker"string.
        - `studentName` holds no reference as it's set to `null`.
        -The remaining elements of the `students` array hold references to `null` strings(because the array was initialized with `null` values).

        So,there is still one reference to the"Peter Parker"string(inside the `students` array),and it is not eligible for garbage collection.The `studentName` variable no longer holds a reference to that string,but it's already set to `null`. The `students` array still holds references to the elements (in this case, references to `null`) and is not eligible for garbage collection.
 */