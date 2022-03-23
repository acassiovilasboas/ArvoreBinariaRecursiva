class EstruturaArvore {
    public int num;
    public EstruturaArvore dir, esq;

    public EstruturaArvore(int num) {
        this.num = num;
    }
}

class Arvore {
    private EstruturaArvore raiz;

    public void inserir(int num) {
        if (raiz == null) {
            raiz = new EstruturaArvore(num);
            System.out.println("criando raiz: " + raiz.num);
        } else {
            EstruturaArvore novo = new EstruturaArvore(num);
            System.out.println("passando por raiz: " + raiz.num);
            inserir(raiz, novo);
        }
    }

    private void inserir(EstruturaArvore arvore, EstruturaArvore novo) {
        if (novo.num > arvore.num) {
            if (arvore.dir == null) {
                System.out.println("incluindo nó a direita: " + novo.num);
                System.out.println("pai: " + arvore.num);
                arvore.dir = novo;
            } else {
                System.out.println("descendo a direita temos  " + arvore.dir.num);
                inserir(arvore.dir, novo);
            }
        } else {
            if (arvore.esq == null) {
                System.out.println("pai: " + arvore.num);
                System.out.println("incluindo nó a esquerda: " + novo.num);
                arvore.esq = novo;
            } else {
                System.out.println("descendo a esquerda temos " + arvore.esq.num);
                inserir(arvore.esq, novo);
            }
        }
    }

    public void imprimir() {
        System.out.println("raiz: " + this.raiz.num);
        imprimir(this.raiz);
    }

    private void imprimir(EstruturaArvore raiz) {
        String str = "";
        while (true) {
            if (raiz != null) {
                if (raiz.dir != null) {
                    System.out.printf("pai: %d\ndireito %d\n", raiz.num, raiz.dir.num);
                }
                if (raiz.esq != null) {
                    System.out.printf("pai: %d\nesquerdo %d\n", raiz.num, raiz.esq.num);
                }
                imprimir(raiz.esq);
                imprimir(raiz.dir);
            } 
            break;
        }
    }
}
