package junitPersona;

public class Alumno extends Persona
{
private String numMat;
private int nota[];
/*public Alumno(){
super();
}*/

public Alumno (String nM){
super();
numMat=nM;
}
public Alumno(){        
        super();
        numMat="matricula1";
        int notas[]=new int[4];
        float s=0;
        for (int i=0;i<notas.length-1;i++)
        {
          notas[i]=(int)(Math.random()*11);
          s+=notas[i];
        }
        notas [3]=(int)(s/3);
       nota=notas;
}
public Alumno (String n, String t, int e,String nM, int []not){
super(n,t,e);
numMat=nM;
nota=not;
}
public void setNumMat(String nm){
     numMat=nm;
}
public void setNota( int n[]){
nota=n;
}
public String getNumMat() {
	return numMat;
}
public int[] getNota( ){
return nota;
}
public int obtenerMedia(int n[])
{
	
	return n[3];
}

public String toString (){
		String cad=super.toString()+" numMAT= "+numMat+" Notas ";
		for (int i=0;i<nota.length-1;i++)
		{
		    cad+=nota[i]+" ";
		}
		cad+="=>"+nota[3];
		return cad;
		}
/* sobreescribir el método equals */
public boolean equals(Object obj)
{
	Alumno alu1 = (Alumno)obj;
	String nMat1=alu1.numMat;
	String nMat2=this.numMat;
		
	return nMat1.equals(nMat2) ;
}
}
