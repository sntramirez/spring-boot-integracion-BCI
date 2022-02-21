package com.integracion.crud.dto;

import java.io.Serializable;
import java.time.Instant;

public class UsuarioListaResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private String email;
	private Instant created;
	private Instant modified;
	private Instant last_login;
	private boolean isactive;

	public Instant getCreated() {
		return created;
	}

	public void setCreated(Instant created) {
		this.created = created;
	}

	public Instant getModified() {
		return modified;
	}

	public void setModified(Instant modified) {
		this.modified = modified;
	}

	public Instant getLast_login() {
		return last_login;
	}

	public void setLast_login(Instant last_login) {
		this.last_login = last_login;
	}

	public boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
