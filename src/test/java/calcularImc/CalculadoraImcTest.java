package calcularImc;

import org.example.CalculadoraImc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.Pessoa;
import org.easymock.EasyMock;

class CalculadoraImcTest {
    Pessoa pessoa;
    CalculadoraImc calculadora;

    @BeforeEach
    void setUp(){
        pessoa = EasyMock.mock(Pessoa.class);
        calculadora = new CalculadoraImc();
    }

    @Test
    void deveClassificarPessoaAbaixoDoPesoFeminino() {
        EasyMock.expect(pessoa.getSexo()).andReturn("F");
        EasyMock.expect(pessoa.getPeso()).andReturn(19.0);
        EasyMock.expect(pessoa.getAltura()).andReturn(1.0).times(2);

        EasyMock.replay(pessoa);

        assertEquals("abaixo do peso", calculadora.calcularImc(pessoa));

        EasyMock.verify(pessoa);
    }

    @Test
    void deveClassificarPessoaNoPesoNormalFeminino() {
        EasyMock.expect(pessoa.getSexo()).andReturn("F");
        EasyMock.expect(pessoa.getPeso()).andReturn(19.1);
        EasyMock.expect(pessoa.getAltura()).andReturn(1.0).times(2);

        EasyMock.replay(pessoa);

        assertEquals("no peso normal", calculadora.calcularImc(pessoa));

        EasyMock.verify(pessoa);
    }

    @Test
    void deveClassificarPessoaMarginalmenteAcimaDoPeso() {
        EasyMock.expect(pessoa.getSexo()).andReturn("F");
        EasyMock.expect(pessoa.getPeso()).andReturn(25.9);
        EasyMock.expect(pessoa.getAltura()).andReturn(1.0).times(2);

        EasyMock.replay(pessoa);

        assertEquals("marginalmente acima do peso", calculadora.calcularImc(pessoa));

        EasyMock.verify(pessoa);
    }

    @Test
    void deveClassificarPessoaAcimaDoPesoIdeal() {
        EasyMock.expect(pessoa.getSexo()).andReturn("F");
        EasyMock.expect(pessoa.getPeso()).andReturn(27.4);
        EasyMock.expect(pessoa.getAltura()).andReturn(1.0).times(2);

        EasyMock.replay(pessoa);

        assertEquals("acima do peso ideal", calculadora.calcularImc(pessoa));

        EasyMock.verify(pessoa);
    }

    @Test
    void deveClassificarPessoaObesaFeminino() {
        EasyMock.expect(pessoa.getSexo()).andReturn("F");
        EasyMock.expect(pessoa.getPeso()).andReturn(32.4);
        EasyMock.expect(pessoa.getAltura()).andReturn(1.0).times(2);

        EasyMock.replay(pessoa);

        assertEquals("obesa", calculadora.calcularImc(pessoa));

        EasyMock.verify(pessoa);
    }

    @Test
    void deveClassificarPessoaAbaixoDoPesoMasculino() {
        EasyMock.expect(pessoa.getSexo()).andReturn("M");
        EasyMock.expect(pessoa.getPeso()).andReturn(20.6);
        EasyMock.expect(pessoa.getAltura()).andReturn(1.0).times(2);

        EasyMock.replay(pessoa);

        assertEquals("abaixo do peso", calculadora.calcularImc(pessoa));

        EasyMock.verify(pessoa);
    }

    @Test
    void deveClassificarPessoaNoPesoNormalMAsculino() {
        EasyMock.expect(pessoa.getSexo()).andReturn("M");
        EasyMock.expect(pessoa.getPeso()).andReturn(20.7);
        EasyMock.expect(pessoa.getAltura()).andReturn(1.0).times(2);

        EasyMock.replay(pessoa);

        assertEquals("no peso normal", calculadora.calcularImc(pessoa));

        EasyMock.verify(pessoa);
    }
    @Test
    void deveClassificarPessoaNoPesoNormal() {
        EasyMock.expect(pessoa.getSexo()).andReturn("M");
        EasyMock.expect(pessoa.getPeso()).andReturn(26.3);
        EasyMock.expect(pessoa.getAltura()).andReturn(1.0).times(2);

        EasyMock.replay(pessoa);

        assertEquals("no peso normal", calculadora.calcularImc(pessoa));

        EasyMock.verify(pessoa);
    }

    @Test
    void deveClassificarPessoaMarginalmenteAcimaDoPesoMasculino() {
        EasyMock.expect(pessoa.getSexo()).andReturn("M");
        EasyMock.expect(pessoa.getPeso()).andReturn(27.7);
        EasyMock.expect(pessoa.getAltura()).andReturn(1.0).times(2);

        EasyMock.replay(pessoa);

        assertEquals("marginalmente acima do peso", calculadora.calcularImc(pessoa));

        EasyMock.verify(pessoa);
    }

    @Test
    void deveClassificarPessoaAcimaDoPesoMAsculino() {
        EasyMock.expect(pessoa.getSexo()).andReturn("M");
        EasyMock.expect(pessoa.getPeso()).andReturn(31.0);
        EasyMock.expect(pessoa.getAltura()).andReturn(1.0).times(2);

        EasyMock.replay(pessoa);

        assertEquals("acima do peso", calculadora.calcularImc(pessoa));

        EasyMock.verify(pessoa);
    }

    @Test
    void deveClassificarPessoaObesoMasculino() {
        EasyMock.expect(pessoa.getSexo()).andReturn("M");
        EasyMock.expect(pessoa.getPeso()).andReturn(32.2);
        EasyMock.expect(pessoa.getAltura()).andReturn(1.0).times(2);

        EasyMock.replay(pessoa);

        assertEquals("obeso", calculadora.calcularImc(pessoa));

        EasyMock.verify(pessoa);
    }
}