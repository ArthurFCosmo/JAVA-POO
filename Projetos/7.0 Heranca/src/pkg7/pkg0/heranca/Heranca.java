
package pkg7.pkg0.heranca;

public class Heranca {
    public static void main(String[] args) {
        Aluno arthur = new Aluno();
        
        arthur.setNome("Arthur Cosmo");
        arthur.setIdade(23);
        arthur.setMatricula("01536528");
        arthur.setCurso("ADS");
        arthur.setMensalidadependente(false);
        arthur.setSexo("Masculino");
        
        arthur.status();
        
        arthur.fazeraniversario();
        
        arthur.status();
        
    }
    
}
