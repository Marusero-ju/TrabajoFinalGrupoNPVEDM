package ar.edu.unju.edm.servicie;

import org.springframework.beans.factory.annotation.Autowired;

public class IUsuarioServicieImp {
	
	@Autowired
	IUsuarioRepository iUsuario;
	
	@Override
	public void crear(Usuario unUsuario) {
	  //TODO Auto-generated method stub
		iUsuario.save(unUsuario);
	}
	
	@Override
	public Iterable<Usuario> listarTodos() {
	  //TODO Auto-generated method stub
		return iUsuario.findAll();
		
	@Override
	public void eliminar(Long id) {
	  //TODO Auto-generated method stub
		iUsuario.deleteById(id);
		}
	
	@Override
	public Usuario modificar(Usuario unUsuario) throws Exception {
	  //TODO Auto-generated method stub
		Usuario usuarioGuardar = encontrarUsuario(unUsuario.getId());
		mapearUsuario(unUsuario, usuarioGuardar);
		
	public void mapearUsuario(Usuario desde, Usuario hacia) {
		hacia.setNombre(desde.getNombre());
		hacia.setApellido(desde.getApellido());
		hacia.setDireccion(desde.getDireccion());
		hacia.setFechaAlta(desde.getFechaAlta());
		hacia.setDni(desde.getDni());
		hacia.setFechaNac(desde.getFechaNac());
	  }
	
	@Override
	public Usuario encontrarUsuario(Long id) throws Exception {
		//TODO Auto-generated method stub
		return iUsuario.findById(id).orElseThrow(()-> new Exception("El Usuario no existe"));
	}
	}
		
}
