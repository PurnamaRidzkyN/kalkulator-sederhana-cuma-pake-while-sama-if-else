import java.util.Scanner;

public class Kalkulator_sederhana{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        double total =0;
        boolean button = true;
        while(button){
            System.out.println("Pilih operasi : ");
            System.out.println("1. tambah ");
            System.out.println("2. kurang ");
            System.out.println("3. kali");
            System.out.println("4. bagi ");
            System.out.println("5. reset angka");
            System.out.print("pilih operasi pake angka yang sesuai : ");
            int  a = sc.nextInt();

            if (a==1){
                boolean on = true;
                while (on){
                    System.out.print("masukan angka (0 untuk keluar) : ");
                    double b = sc.nextDouble();
                    if (b ==0 ){
                        on = false;
                        break;
                    }  
                    total += b;
                }
            }else if (a==2){
                boolean on = true;
                while (on){
                    System.out.print("masukan angka (0 untuk keluar) : ");
                    double b = sc.nextDouble();
                    if (b ==0 ){
                        on = false;
                        break;
                    }
                    System.out.print("masukan angka (0 untuk keluar) : ");
                    double c = sc.nextDouble();
                    if (c==0 ){
                        total-=b;
                        on = false;
                        break;
                    }if (total == 0){
                        total = b - c;
                    }else {
                        if (b>0){
                            total-=b;
                            total-=c;
                        }
                    }
                }
            }else if (a==3){
                boolean on = true;
                while (on){
                    System.out.print("masukan angka (0 untuk keluar) : ");
                    double b = sc.nextDouble();
                    if (b ==0 ){
                        on = false;
                        break;
                    }  
                    System.out.print("masukan angka (0 untuk keluar) : ");
                    double c = sc.nextDouble();
                    if (c==0){
                        total*=b;
                        on = false;
                        break;
                    }
                    if (total==0){
                        total = b*c;
                        break;
                    }else if(total>0){
                        total*=b;
                        total*=c;
                    }
                    }
            }else if (a==4){
                boolean on = true;
                while (on){
                    System.out.print("masukan angka (0 untuk keluar) : ");
                    double b = sc.nextDouble();
                    if (b ==0 ){
                        on = false;
                        break;
                    }  
                    System.out.print("masukan angka (0 untuk keluar) : ");
                    double c = sc.nextDouble();
                    if (c==0){
                        total/=b;
                        on = false;
                        break;
                    }
                     if (total==0){
                        total = b/c;
                        break;
                    }else if(total>0){
                        total/=b;
                        total/=c;
                    }
                }
            }else if(a == 5){
                total =0;
            }else if (a == 0){
                break;
            }
         System.out.println("total : "+total);
    }
    
}
}