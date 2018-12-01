import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class ImagesView {

	private String option;
	private List<String> images;

	@PostConstruct
	public void init() {
		images = new ArrayList<String>();
		carregarJogosXbox();
		carregarJogosPs4();
		carregarJogosWii();
	}

	public void setOption(String option) {
		FacesContext context = FacesContext.getCurrentInstance();
		String mensagem = "";
		if (option != null && !option.equals("")) {
			images = new ArrayList<String>();
			if (option.equals("Xbox One")) {
				carregarJogosXbox();
			} else if (option.equals("Ps4")) {
				carregarJogosPs4();
			} else if (option.equals("wii")) {
				carregarJogosWii();
			}
			mensagem = "Plataforma selecionada com sucesso";
		} else {
			mensagem = "Todas as plataformas selecionadas";
		}
		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "SUCESSO", mensagem));
		this.option = option;
	}

	private void carregarJogosXbox() {
		for (int i = 1; i <= 12; i++) {
			images.add("jogoXbox" + i + ".jpg");
		}
	}

	private void carregarJogosPs4() {
		for (int i = 1; i <= 10; i++) {
			images.add("jogoPs4" + i + ".jpg");
		}
	}

	private void carregarJogosWii() {
		for (int i = 1; i <= 12; i++) {
			images.add("jogoWii" + i + ".jpg");
		}
	}

	public List<String> getImages() {
		return images;
	}

	public String getOption() {
		return option;
	}
}