/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemadevendas_2_0;

import com.mycompany.controle.Controle_Sistema;
import com.mycompany.outros.Constantes;
import com.mycompany.visao.VisaoMenu;

/**
 *
 * @author stefanny.0181
 */
public class SistemadeVendas_2_0 {

    public static void main(String[] args) {
        int opcaoMenu;
        
        while(true){
            opcaoMenu = VisaoMenu.menuPrincipal();
            
            if(opcaoMenu == Constantes.CADASTRAR){
                Controle_Sistema.cadastrar();
            }else if(opcaoMenu == Constantes.ALTERAR){
                Controle_Sistema.alterar(VisaoMenu.menuAlteracaoProduto());
            }else if(opcaoMenu == Constantes.LISTAR){
                Controle_Sistema.listar(Controle_Sistema.produtos);
            }
            
        }
    }
}
