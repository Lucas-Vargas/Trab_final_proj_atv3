package trab_proj_atv3;

import java.util.Scanner;

public class Trab_proj_atv3 {
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int ano_nasc, ano_trab, resp,resp2,resp3, resp3f;
       String gen;
        System.out.println("Insira seu Gênero: \"m\" para Masculino e \"f\" para Feminino");       
        gen = ler.nextLine();
        System.out.println("Insira seu ano de nascimento");
        ano_nasc = ler.nextInt();
        System.out.println("Insira a quantos anos você trabalha.");
        ano_trab = ler.nextInt();
        resp = 2021-ano_nasc;
        resp2 = 2021 - ano_nasc;
        resp3 = 30-ano_trab;
        resp3f = 25-ano_trab;
        if("m".equals(gen)){
            if(ano_trab <30 && ano_nasc>1956){
                    System.out.println("Você não possui nenhum dos requisistos necessários para adquirir a aposentadoria.\nidade atual "+resp+"\nidade necessaria: 65\nanos trabalhados: "+ano_trab+"\nanos necessários: 30");
            }if(ano_nasc == 1956 || ano_nasc <1956){
                if(ano_trab == 30 || ano_trab > 30){
                    System.out.println("Você é responde a todas as qualiicações para se aposentar");
                }else{
                    System.out.println("Você tem a idade necessaria para se aposentar, porém não cumpriu a carga horaria necessária.\nCarga horaria atual: "+ano_trab+", faltam "+resp3+" ano(s) para completar a carga horária de 30 anos.");                   
                }
            }else{
                if(ano_trab == 30 || ano_trab > 30){
                    System.out.println("Você trabalhou o suficiente para se aposentar, porém sua idade não condiz com a necessária para adquirir a aposentadoria.\nidade necessaria: 65 anos\nidade atual: "+resp);
                }else{
                    System.out.println("Você não possui nenhum dos requisistos necessários para adquirir a aposentadoria.\nidade atual "+resp+"\nidade necessaria: 65\nanos trabalhados: "+ano_trab+"\nanos necessários: 30");
                }
            }
        }if("f".equals(gen)){
            if(ano_trab <25 && ano_nasc>1961){
                    System.out.println("Você não possui nenhum dos requisistos necessários para adquirir a aposentadoria.\nidade atual "+resp+"\nidade necessaria: 60\nanos trabalhados: "+ano_trab+"\nanos necessários: 25");
            }if(ano_nasc == 1961 || ano_nasc <1961){
                if(ano_trab == 25 || ano_trab > 25){
                    System.out.println("Você é responde a todas as qualiicações para se aposentar");
                }else{
                    System.out.println("Você tem a idade necessaria para se aposentar, porém não cumpriu a carga horaria necessária.\nCarga horaria atual: "+ano_trab+", faltam "+resp3f+" ano(s) para completar a carga horária de 25 anos.");                   
                }
            }else{
                if(ano_trab == 25 || ano_trab > 25){
                    System.out.println("Você trabalhou o suficiente para se aposentar, porém sua idade não condiz com a necessária para adquirir a aposentadoria.\nidade necessaria: 60 anos\nidade atual: "+resp);
                }else{
                    System.out.println("Você não possui nenhum dos requisistos necessários para adquirir a aposentadoria.\nidade atual "+resp+"\nidade necessaria: 60\nanos trabalhados: "+ano_trab+"\nanos necessários: 25");
                }
            }
        }
    }
}
    

