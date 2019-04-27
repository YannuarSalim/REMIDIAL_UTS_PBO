/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remidialpbo;

/**
 *
 * @author samsung
 */
public class Komputer {
    private CPU Cpu;
    
    public Komputer(CPU Cpu){
        this.Cpu=Cpu;
    }
    public void memasang(CPU Cpu){
        this.Cpu=Cpu;
        System.out.println("CPU: "+this.Cpu.getCPUData()+" GHz"+" dicabut");
    }
    public void mencabut(CPU Cpu){
        this.Cpu=Cpu;
        System.out.println("CPU: "+this.Cpu.getCPUData()+" GHz"+" dipasang");
    }
    public void cetakInfo(){
        System.out.println("Spesifikasi: "+"CPU:"+this.Cpu.getCPUData()+" GHz");
    }
}
