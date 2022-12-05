List<Number> isPrimeOrNot(int Num) {
    List<Number> output = new ArrayList<>();
    int n = 0;
    for(int i = 2; i < (Num/2+1); i++) {
        if(Num % i == 0){
            n++;
            break;
        }
    }
    if (n == 0){
        output.add(1);
        return output;
    } else{
        output.add(1);
        output.add(2);
        for(int num = 2; num < Num; num++) {
            int count=0;
            for(int j=2;j<=num/2+1;j++){
                if(num%j==0){
                    count++;
                    break;
                }
            }
            if (count==0){
                output.add(num);
            }
        }
        return output;
  }
}