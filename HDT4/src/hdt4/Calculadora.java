

import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Stack;

public class Calculadora {
	
	private ArrayList<String[]> expresiones;
	private Stack<String> stackOperandos;
	
	public Calculadora(){
		expresiones = new ArrayList<String[]>();
		stackOperandos = new StackArrayList<String>();
	}
	
	public void lectorArchivo(){
		File datos;
		FileReader datosLeidos=null;
		BufferedReader br;
		try{
			datos = new File ("./datos.txt");
			datosLeidos = new FileReader (datos);
			br = new BufferedReader(datosLeidos);
			
			String linea;
			while((linea=br.readLine())!=null){
            		String [] expresionDividida = linea.split(" ");
	            	expresiones.add(expresionDividida);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try{                    
            if( null != datosLeidos ){   
            	datosLeidos.close();     
            }                  
         }catch (Exception e){ 
            e.printStackTrace();
         }
	}
	
	public void realizaOperaciones(){
		for(String[] linea: expresiones){//
			//this.ingresarDatosAlStack(ln);
			for(String e:linea){
				
				try{
					Integer.parseInt(e);	
					stackOperandos.push(e);
				}catch(Exception ex){
					//System.out.println("NO ES UN NUMERO!");
					stackOperandos.push(e);
					System.out.println(this.operarElementos());
					
				}	
			}
			
		}
	}
	
	public int operarElementos(){
		
		String operacion = stackOperandos.pop();
		int n2= Integer.parseInt(stackOperandos.pop());
		int n1= Integer.parseInt(stackOperandos.pop());
		switch(operacion){
			case "+":
				
				return n1+n2;
			case "-":
				return n1-n2;
			case "/":
				return n1/n2;
			case "*":
				return n1*n2;
			default:
				return 0;
		}
	}
/*
	public void ingresarDatosAlStack(String[] funcion){
		for(int i=funcion.length-1;i>=0;i--){
			stackOperandos.push(funcion[i]);
		}
		//Imprime los datos ingresados al stack
		//System.out.println("segun pop--->");
		int cont= stackOperandos.size();
		
		for(String e:funcion){
			System.out.println(e);
			
		}
		
		for(int i=0; cont>i; i++){
			//System.out.println(stackOperandos.pop());
		}
	}
	*/
}