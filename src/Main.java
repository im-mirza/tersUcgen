public class Main {

            public static void main(String[] args) {
                int satirSayisi = 5;
            //satir uzunlugu
                for (int i = satirSayisi; i >= 1; i--) {
                    //ucgen cizibilme adina goze gorunmeyen bosluklar ekliyoruz yildizlarin onune, satirsayisindan i ciktigimizda bosluk 2. satirdan basliyor
                    for (int j = 1; j <= satirSayisi-i ; j++) {
                        System.out.print(" ");
                    }//yildizlar iki iki azalarak ekrana basdiriliyor
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("*");
                    }//yildiz satirlari arasi bosluklar
                    System.out.println();
                }
            }



}