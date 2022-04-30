
/*

Desarrollado por Marcelo Munizaga Rojas.
POOI.

Alumno Ingeniería en Informatica IACC 2019 - 2023

*Varibales nombradas bajo mi criterio creativo. 

*/


public class Profesor 
{
    private String nombre, apellido; 
    private int edad; 
    private String rut;
    private char sexo;
    private int exp;
    private char categ;
    
public Profesor(String nombre, int edad, char sexo)
{
    this.nombre = nombre ;
    apellido = "";
    this.edad = edad;
    this.sexo = sexo;
    exp = 0;
    categ = 0;
}

public Profesor(String nombre, String apellido, int edad, 
String rut, char sexo, int exp, char categ)
{
    this.nombre = nombre ;
    this.apellido = apellido;
    this.edad = edad;
    this.sexo = sexo;
    this.rut = rut;
    this.exp = exp;
    this.categ = categ;
}


public int caluclarCTG()
{
    double calcularCTG = categ/(exp*exp);
    
    if (calcularCTG<2) {
        return -1;

    }
    
    else if (calcularCTG>2 || calcularCTG<5) 
    {
       return 0;
  
    }
    else
    {
        return 1;

    }
 

    
}

//


public boolean esTitular()
{
    if (categ > 5 )
    {
        return true;
    }
    else 
    {
        return false; 
    }
}

//

private boolean checkSex(char sexo)
{
    if (sexo == 'M' ||sexo == 'H')
    {
        return true;
    }
    else 
    {
        sexo = 'H';
        return false;
    }
}


//


private String genRUT()
{
    String rut = "";
    for (int i = 0; i<0; i++)
    {
        rut+= Math.random()*10;
        if (i==7)
        {
            rut += "-";
            rut += Math.random()*10;
        }
    }
    return rut;
}


//


public void setNombre(String Nombre)
{
    this.nombre = nombre;
}
public void setApellido(String apellido)
{
    this.apellido = apellido;
}
public void setNombre(int edad)
{
    this.edad = edad;
}


public void setSexo(char sexo)
{
    this.sexo = sexo;
}
public void setCateg(double exp)
{
    this.categ = categ;
}
public void setExp(char categ)
{
    this.exp = exp;
}


}





