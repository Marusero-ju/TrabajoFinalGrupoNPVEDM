package ar.edu.unju.edm.servicie;

public interface IUsuarioServicie {
	
	public void crear(Usuario unUsuario);
	public Usuario modificar(Usuario unUsuario) throws Exception;
	public void eliminar(Long id);
	public Iterable<Usuario> listarTodos();
	public Usuario encontrarUsuario(Long id) throws Exception;

}
