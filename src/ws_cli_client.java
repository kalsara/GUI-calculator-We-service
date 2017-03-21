/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws_cli_client;

/**
 *
 * @author kalsara
 */
public class ws_cli_client {
     /**
     * @param args the command line arguments
     */

    public static void main(String[] args) 
    { int a = 15;
      int b = 15;
      
      int result = addNumbers(a, b);
      System.out.println("add operation result = " + result);
    }

    private static int addNumbers(int a, int b) 
   {    calculator_ws.Calculator_Service service = new calculator_ws.Calculator_Service();
        calculator_ws.Calculator port = service.getCalculatorPort();
        return port.addNumbers(a, b);
    }

   
}
