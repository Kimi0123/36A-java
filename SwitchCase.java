public class SwitchCase {
    public static void main(String[] args) {
        int day = 5;
        switch (day) {
            //day = 0 
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        

    
}
/ nest switch statament 
String bevereage ="coke";
char gender ='m';
switch(beverage){
    case "coke":
     switch (gender){
        case 'm':
           System.out.println("male");
           break;
        case 'f':
           System.out.println("Female");
           break;
    }
    System.out.println("black");
    break;
default:
System.out.println("unknown beverage");
break;    
    }
}
9

//nest switch statement 
String beverage ="coke";
switch(beverage) {
    case "coke":
    System.out.println("Coke");
    break;
    case "pepsi":
    System.out.println("Pepsi");
    break;
    case "sprite":
    System.out.println("Sprite");
    break;

    //switch case 
    int status =404;
    switch (status){
        case 200:
        case 201:
        case 202:
        System.out.println("OK");
        break;
        

    }
    