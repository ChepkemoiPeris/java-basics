class ForLoop {
    public static void main(String[] args) {
        // for(int num = 1; num <=10;num++){
        //     System.out.println(num);
        // }

        //sum the numbers in array
    // int numbers[] = {1,2,3,4,5,6,7,8,9,10};
    // int sum = 0;
    // for(int index = 0;index<numbers.length;index++){
    //     sum += numbers[index];
    // }
    // System.out.println(sum);

    // int number = 5;
    // for(int multiplier = 1;multiplier<10;multiplier++){
    //     System.out.printf("%d X %d = %d \n",number,multiplier,number*multiplier);
    // }

  
    // for(int number = 1;number<=10;number++){
    //     for(int multiplier = 1;multiplier<=10;multiplier++){
    //         System.out.printf("%d X %d = %d \n",number,multiplier,number*multiplier);
    //     }
    // }
    //for loop shortcut
    int numbers[] ={1,2,3,4,5,6,7,8,9,10};
    int sum = 0;
    for(int number:numbers){
        sum +=number; 
    }
    System.out.println(sum);

    //while loop
    int number = 5;
    int multiplier=1;
    // while (multiplier <= 10) {
    //     System.out.printf("%d X %d = %d \n",number,multiplier,number*multiplier);
    //     multiplier++;
    // }

    //do while loop
    do{
       System.out.printf("%d X %d = %d \n",number,multiplier,number*multiplier);
       multiplier++;
    }while(multiplier<=10);
    }

    
}
