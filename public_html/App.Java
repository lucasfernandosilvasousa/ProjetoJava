public class App {
    public static void main(String[] args) throws Exception {

Oculos oculosA = new Oculos();
oculosA.preco = 22.5;
oculosA.cor = "preta";
oculosA.limpo = false;
oculosA.Dia();
oculosA.lave();

System.out.println("preco: " +oculosA.preco);
System.out.println("cor"  +oculosA.cor);
System.out.println("limpo" +oculosA.limpo);

 Bone boneA = new Bone();
boneA.cor = "transparente";
boneA.aba = "curvada";
boneA.tamanho = 26.3;
boneA.velho = true;

boneA.sol();
boneA.trocar();

System.out.println("cor: " +boneA.cor);
System.out.println("area: " + boneA.aba);
System.out.println("tamanho: "+ boneA.tamanho);
System.out.println("velho: "+ boneA.velho);
