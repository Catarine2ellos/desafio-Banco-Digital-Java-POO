import jdk.swing.interop.SwingInterOpUtils;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);


        Cliente Catarine = new Cliente();
        Catarine.setNome("Catarine");

        Conta cCorrente = new ContaCorrente(Catarine);

        cCorrente.depositar(150);
        cCorrente.imprimirExtrato();

        Conta cPoupanca = new ContaCorrente(Catarine);

        cPoupanca.transferir(50, cCorrente);
        cCorrente.imprimirExtrato();

        }




    }

