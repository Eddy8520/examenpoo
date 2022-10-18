/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siseddysilva;

/**
 *
 * @author alexa
 */
public class Empleados {
    
    private String Nombre; 
    private String puesto;
    private double salario;
    private double aumento;



    public Empleados() {
    }

    public Empleados(String Nombre, String puesto, double salario) {
        this.Nombre = Nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
     
        this.salario = salario;
    }

        public double getAumento() {
        return aumento;
    }
/*
    public void setAumento(double aumento) {
        double temp;
        if (puesto.toLowerCase().equals("gerente")){
            temp=salario*0.05;
             this.aumento = salario+temp;
            
        }
         if (puesto.toLowerCase().equals("asistente")){
             temp=salario*0.1;
              this.aumento = salario+temp;
        }
          if (puesto.toLowerCase().equals("secretario")){
             temp=salario*0.15;
             this.aumento = salario+temp;
        }
        
    }
    
    */
    
    
}
