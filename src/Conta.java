public abstract class Conta implements IConta {

    protected static final int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 1;
    protected int agencia;
    protected int nConta;
    protected double saldo;

    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.nConta = SEQUENCIAL++;
        this.cliente = cliente;
    }
    

    public int getAgencia() {
        return agencia;
    }

    public int getnConta() {
        return nConta;
    }

    public double getSaldo() {
        return saldo;
    }



    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s",this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.nConta));
        System.out.println(String.format("Saldo Disponível: %.2f", this.saldo));
       // System.out.println(String.format("Saldo Total: %.2f", this.saldoDisponivel));
    }


        @Override
        public void sacar ( double valor){

           if(saldo > 0) {
                saldo -= valor;

            }else {

            }

        }

        @Override
        public void depositar ( double valor){
            saldo += valor;
            }

        @Override
        public void transferir ( double valor, Conta contaDestino){

                this.sacar(valor);
                contaDestino.depositar(valor);


        }

    }

