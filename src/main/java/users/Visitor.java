package users;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Visitor {

	@Id
	private String cpf;
	private String name;
	private String password;
	private String rg;
	private String phone;
	private String employRgstry;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmployRgstry() {
		return employRgstry;
	}

	public void setEmployRgstry(String employRgstry) {
		this.employRgstry = employRgstry;
	}

	public Visitor(String cpf, String name, String password, String rg, String phone, String employRgstry) {
		this.cpf = cpf;
		this.name = name;
		this.password = password;
		this.rg = rg;
		this.phone = phone;
		this.employRgstry = employRgstry;
	}

	public void register(Visitor visitor) {

	}

	public List<Visitor> list() {

		return new ArrayList<Visitor>();

	}

	// O metodo validateToken(ValidarFicha) n�o fazeria mais sentido estar na classe
	// Employee?
	public void validateToken(Employee employee) {

	}

}