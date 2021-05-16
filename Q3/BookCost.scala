object BookCopy extends App{
    def fun(x:Int):Double={
          var price:Double=(24.95*60)/100;
              if(x>50){
                      var cost:Double=((price*x)+150+(x-50)*0.75);
                            cost;}
                                else{
                                        var cost:Double=((price*x)+(x*3));
                                              cost;}
                                                }
      println(fun(60));
}
