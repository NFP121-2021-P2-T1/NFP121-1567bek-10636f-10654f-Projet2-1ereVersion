/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternFiles.DecoratorPatternFiles;

/**
 *
 * @author Cynthia
 */
public class ConcreteDecoratorA extends Decorator{
    
    public ConcreteDecoratorA (Component c){
        
        super(c);
        
    }
    public String operation(){
        
        return super.operation()+"";
        
    }
}
