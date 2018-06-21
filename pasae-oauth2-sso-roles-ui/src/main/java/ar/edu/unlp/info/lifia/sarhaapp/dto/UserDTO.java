package ar.edu.unlp.info.lifia.sarhaapp.dto;

public class UserDTO {

	private Long id;

	private String username;

	public UserDTO(Long id, String username) {
		this();
		setId(id);
		setUsername(username);
	}

	public UserDTO() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
