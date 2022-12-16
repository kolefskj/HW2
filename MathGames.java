package HW2;

import javax.lang.model.util.ElementScanner14;

import org.w3c.dom.css.ElementCSSInlineStyle;

public class MathGames {
    // 1. Create a method that will calculate the Pythagorean Theorem (https://en.wikipedia.org/wiki/Pythagorean_theorem)
    // c = sqrt(a^2+b^2)
    // NOTE: You can assume you will only need to calculate the Hypotenuse
    // Hint 1: Method should take in 2 sides(a and b) of the triangle and return the missing side.
    //      Remember the Triangle has a base, Perpendicular, and Hypotenuse
    // Hint 2: Math.pow and Math.sqrt are your friend here
    // Bonus points: Try to make it accept any 2 sides and return the 3rd. So it can take in
    // Hypotenuse and Perpendicular and return the base.
    public static void Pythagorean()
    {
        double adjacent, opposite, hypotenuse;
        adjacent = Double.parseDouble(args[0]);
        opposite = Double.parseDouble(args[1]);
        hypotenuse = Math.sqrt((adjacent*adjacent)+(opposite*opposite));
        System.out.println("Hypotenuse: " +hypotenuse);
    }    
    // 2. Create a method that will calcuate my grade in the class. You can use the grade range as follows
        // A: 100 - 90
        // B:  89 - 80
        // C:  79 - 70
        // D:  69 - 60
        // F:  60 -  0 
        // method should accept the grade as a double and return the letter grade of what I got
        // NOTE: Im a really nice guy and always round up on my grading so a 69.3 will round up to a 70.0
        // Hint 1: if statements are your friend here you will probably need at the least 5 if / ifelse / else statments
        // Hint 2: You will probably need to cast the double to an int
        // Hint 3: You will probably need to use the Math.ceil() method 
    public static void Grades()
    {
        double grade = Double.parseDouble(args[0]);
        String gradeLetter;
        if (grade >= 90 && grade > 89)
        {
            gradeLetter = "A";
            System.out.println("Your grade is " +gradeLetter);
        }
        else 
        if (grade < 90 && grade >= 80)
        {
            gradeLetter = "B";
            System.out.println("Your grade is " +gradeLetter);
        }
        else 
        if (grade < 80 && grade >= 70)
        {
            gradeLetter = "C";
            System.out.println("Your grade is " +gradeLetter);
        }
        else
        if (grade > 70 && grade >= 60)
        {
            gradeLetter = "D";
            System.out.println("Your grade is " +gradeLetter);
        }
        else 
            gradeLetter = "F";
            System.out.println("Your grade is " +gradeLetter);
    }
    // 3. Create a method that will calculate the tip on a bill per person
    //      Method parameters: total bill, amount of people splitting the bill, percentage to tip.
    //      Note: I would like the total always rounded up to a whole number
    //      Hint 1: percentage can be made easier to work with if you divide by 100 so 18% is 18/100 = 0.18
    //      Hint 2: Using doubles will be helpful for when you need to calculate decimals
    //      Hint 3: It is possible you might need to Cast a double to an int or vice versa
    //      Hint 4: You will probably need to use the Math.ceil() method 
    public static void Tip()
    {
        double total , split , tipPercentage, people, billPer, tip, billTip;

    
        System.out.println("Hello please enter the bill amount");
        total = Double.parseDouble(args[0]);
        System.out.println("What percentage would you like to tip?");
        tipPercentage = Double.parseDouble(args[1]);
        tip = total * (tipPercentage/100);
        billTip = total * (tipPercentage/100) + total;
        System.out.println("Will this bill be split? 1 for YES or 0 for NO");
        split = Double.parseDouble(args[2]);
        if (split == 1)
        {
            System.out.println("By how many people ");
            people = Double.parseDouble(args[3]);
            billPer = total / split;
            System.out.println("Your total is " +billPer);
        }
        else
        if (split == 0);
        {
            System.out.println("Your total is: " +total);
        }
    }

    // you do not need this main if you want to make a tester class
    public static void main(String[] args) 
    {
        MathGames.Pythagorean();
        MathGames.Grades();
        MathGames.Tip();
    }
}