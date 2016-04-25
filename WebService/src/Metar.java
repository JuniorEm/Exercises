

import java.util.Calendar;
import java.util.Date;

public class Metar {
	private final String codigo;
	private final String atualizacao;
	private final String pressao;
	private final String temperatura;
	private final String tempo;
	private final String tempo_desc;
	private final String umidade;
	private final String vento_dir;
	private final String vento_int;
	private final String intensidade;
	
	public Metar(String codigo, String atualizacao, String pressao, String temperatura, String tempo, String tempo_desc,
			String umidade, String vento_dir, String vento_int, String intensidade) {
		this.codigo = codigo;
		this.atualizacao = atualizacao;
		String dateFormat = "dd/mm/yyyy HH:mm:ss";
		dateFormat.format(atualizacao);
		this.pressao = pressao;
		this.temperatura = temperatura;
		this.tempo = tempo;
		this.tempo_desc = tempo_desc;
		this.umidade = umidade;
		this.vento_dir = vento_dir;
		this.vento_int = vento_int;
		this.intensidade = intensidade;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getAtualizacao() {
		return atualizacao;
	}

	public String getPressao() {
		return pressao;
	}

	public String getTemperatura() {
		return temperatura;
	}

	public String getTempo() {
		return tempo;
	}

	public String getTempo_desc() {
		return tempo_desc;
	}

	public String getUmidade() {
		return umidade;
	}

	public String getVento_dir() {
		return vento_dir;
	}

	public String getVento_int() {
		return vento_int;
	}

	public String getIntensidade() {
		return intensidade;
	}
	
	
}
