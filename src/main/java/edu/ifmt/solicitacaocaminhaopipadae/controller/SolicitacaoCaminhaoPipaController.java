package edu.ifmt.solicitacaocaminhaopipadae.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.ifmt.solicitacaocaminhaopipadae.model.solicitacao_cp.NivelUrgencia;
import edu.ifmt.solicitacaocaminhaopipadae.model.solicitacao_cp.SolicitacaoCaminhaoPipa;
import edu.ifmt.solicitacaocaminhaopipadae.repository.SolicitacaoCaminhaoPipaRepository;


@Controller
@RequestMapping("/solicitacaoCaminhaoPipa")
public class SolicitacaoCaminhaoPipaController {

	private static final String CADASTRO_VIEW = "CadastroSolicitacaoCaminhaoPipa";

	@Autowired
    private SolicitacaoCaminhaoPipaRepository solicitacaoCPRepository;
	
	@ModelAttribute("niveisUrgencia")
	public List<NivelUrgencia> niveisUrgencia() {
		return Arrays.asList(NivelUrgencia.values());
	}
	
	@RequestMapping("/pesquisar")
	public ModelAndView pesquisar() {
		List<SolicitacaoCaminhaoPipa> listaSolicitacoesCP = solicitacaoCPRepository.findAll();

		ModelAndView mv = new ModelAndView("PesquisaSolicitacaoCP");
		mv.addObject("listaSolicitacoesCP", listaSolicitacoesCP);
		return mv;
	}
	
	@RequestMapping("/novo")
	public ModelAndView novo() {
		return new ModelAndView(CADASTRO_VIEW);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(SolicitacaoCaminhaoPipa solicitacaoCP) {
		solicitacaoCPRepository.save(solicitacaoCP);

		ModelAndView mv = new ModelAndView(CADASTRO_VIEW);
		mv.addObject("mensagem", "Solicitação enviada com sucesso!" );
		return mv;
	}
}
