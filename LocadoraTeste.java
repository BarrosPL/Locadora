import org.junit.Assert;
import org.junit.Test;
import org.example.Cliente;
import org.example.Dvd;
import org.example.Locadora;
public class LocadoraTeste {
    Locadora loc = new Locadora();
    Cliente c1 = new Cliente(100, "ana");
    Dvd d1 = new Dvd(1, "Rambo");
    Cliente c2 = new Cliente(200, "pedro");
    Dvd d2 = new Dvd(2, "StarWars");
    Cliente c3 = new Cliente(300, "caio");
    Dvd d3 = new Dvd(3, "Vingadores");
    @Test
    public void testFazerEmpréstimoDeveFuncionarSemProblemas() {

        Assert.assertTrue(loc.cadastroCliente(c1));
        Assert.assertTrue(loc.cadastroCliente(c2));
        Assert.assertTrue(loc.cadastroCliente(c3));
        Assert.assertTrue(loc.cadastroDvd(d1));
        Assert.assertTrue(loc.cadastroDvd(d2));
        Assert.assertTrue(loc.cadastroDvd(d3));
        Assert.assertEquals(0, loc.contardvdemprestado());
        // faz um empréstimo mediante o cliente e o dvd que se quer pegar emprestado
        Assert.assertTrue(loc.emprestimo(c1, d1));
        Assert.assertTrue(loc.emprestimo(c2, d2));
        Assert.assertEquals(2, loc.contardvdemprestado()); // deve existir apenas 2 emprestimos
        Assert.assertTrue(loc.emprestimo(c3, d3));
        Assert.assertEquals(3, loc.contardvdemprestado()); // deve existir apenas 3 emprestimos
    }

    // abaixo, estão faltando 3 testes que devem verificar cenários de uso da locadora
    // leia o nome dos métodos: estes darão dicas de que cenário o JUnit deve checar
    @Test
    public void testLocadoraNãoPermitirLocarDVDJáEmprestadoParaOutroCliente() {

        Assert.assertTrue(loc.cadastroCliente(c1));
        Assert.assertTrue(loc.cadastroCliente(c2));
        Assert.assertTrue(loc.cadastroCliente(c3));
        Assert.assertTrue(loc.cadastroDvd(d1));
        Assert.assertTrue(loc.cadastroDvd(d2));
        Assert.assertTrue(loc.cadastroDvd(d3));
        Assert.assertTrue(loc.emprestimo(c2,d1));
        Assert.assertTrue(loc.emprestimo(c1,d2));
        Assert.assertFalse(loc.emprestimo(c3,d1));
        Assert.assertEquals(2, loc.contardvdemprestado());

    }

    @Test
    public void testLocadoraNãoPermitirCadastrarNaLocadoraClienteJáExistente() {
        Assert.assertTrue(loc.cadastroCliente(c1));
        Assert.assertTrue(loc.cadastroCliente(c3));
        Assert.assertFalse(loc.cadastroCliente(c1));
        Assert.assertFalse(loc.cadastroCliente(c3));

    }

    @Test
    public void testLocadoraNãoPermitirCadastrarNaLocadoraDVDJáExistente() {
        Assert.assertTrue(loc.cadastroDvd(d1));
        Assert.assertTrue(loc.cadastroDvd(d3));
        Assert.assertFalse(loc.cadastroDvd(d1));
        Assert.assertFalse(loc.cadastroDvd(d3));

    }
}