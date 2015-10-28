package creencias;

public class vector {

    String v[] = new String[28];
    int num[] = new int[28];

    {
        v[0] = "las sagradas escrituras 1";
        v[1] = "la trinidad 2";
        v[2] = "Dios padre 3";
        v[3] = "Dios hijo 4";
        v[4] = "Dios espiruto santo 5";
        v[5] = "la creación 6";
        v[6] = "la naturaleza del hombre 7";
        v[7] = "el gran conflicto 8";
        v[8] = "la vida, muerte y resurrecion de cristo 9";
        v[9] = "la esperencia de salvación 10";
        v[10] = "el crecimiento en cristo 11";
        v[11] = "la iglesia 12";
        v[12] = "el remanente y su misión 13";
        v[13] = "la unidad en el cuerpo de cristo 14";
        v[14] = "el bautismo 15";
        v[15] = "la sena del señor 16";
        v[16] = "los dones y ministerios espirituales 17";
        v[17] = "el don de profecia 18";
        v[18] = "la ley de Dios 19";
        v[19] = "el sabado 20";
        v[20] = "la mayordomia 21";
        v[21] = "conducta cristiana 22";
        v[22] = "el matrimonio y la familia 23";
        v[23] = "el ministrio de cristo en el santuario celestial 24";
        v[24] = "la segunda venidad de cristo 25";
        v[25] = "muerte y resurreción 26";
        v[26] = "el ministerio y el fin del pecado 27";
        v[27] = "la nueva tierra 28";
    }
    {
        num[0]= 1 ;
        num[1]= 2 ;
        num[2]= 3 ;
        num[3]= 4 ;
        num[4]= 5 ;
        num[5]= 6 ;
        num[6]= 7 ;
        num[7]= 8 ;
        num[8]= 9 ;
        num[9]= 10 ;
        num[10]= 11 ;
        num[11]= 12 ;
        num[12]= 13 ;
        num[13]= 14 ;
        num[14]= 15 ;
        num[15]= 16 ;
        num[16]= 17 ;
        num[17]= 18 ;
        num[18]= 19 ;
        num[19]= 20 ;
        num[20]= 21 ;
        num[21]= 22 ;
        num[22]= 23 ;
        num[23]= 24 ;
        num[24]= 25 ;
        num[25]= 26 ;
        num[26]= 27 ;
        num[27]= 28 ;
    }
    
    public String ordenar(int i){
        for (int j = 0; j < 27; j++) {
            for (int k = i+1; k < 28; k++) {
                 if (num [j] > num[k]) {
                     String temp; 
                     temp = v[j]; 
                     v[j] = v[k];
                     v[k] = temp;
                     
                     int tem;
                     tem = num[j];
                     num[j] = num[k];
                     num[k] = tem;
                }
            }
        }
     return v[i];   
    }
     public String desordenar(int i){
        for (int j = 0; j < 27; j++) {
            for (int k = 1; k < 28; k++) {
                int x;
                x = num[k];
                 if (num [j] > x) {
                     String temp; 
                     temp = v[j]; 
                     v[j] = v[k];
                     v[k] = temp;
                     
                     int tem;
                     tem = num[j];
                     num[j] = num[k];
                     num[k] = tem;
                }
            }
        }
     return v[i];   
    }

public String busqueda(int c){
         int a = 0, a2, a3=num.length-1;
         String cas="Datos No Encontrados";
             while (a<= a3){
                 a2 = (a+a3)/2;
                 if (num[a2]==c)
                 return v[a2];
                 else if (num[a2]<c){
                     a= a2+1;
                     
                 }
                 else{
                     a3=a2-1;
                 }
                 
             }
   return cas  ;
 }
 
 public String insercion(int m){
      for (int i = 1; i < num.length; i++) 
        {
           int aux = num[i];
           String text = v[i];
            for (int j = i-1; j >=0 && num[j]>aux; j--)
            {
                num[j+1]=num[j];
                num[j]=aux;
                
                v[j+1]=v[j];
                v[j]=text;
            }
 }
      return v[m];
 }
}
