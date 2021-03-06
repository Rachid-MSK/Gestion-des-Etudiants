package org.sid.scolarite.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.validation.Valid;

import org.apache.commons.io.IOUtils;
import org.sid.scolarite.dao.EtudiantRepository;
import org.sid.scolarite.entities.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping(value="/Etudiant")
public class EtudiantController {
	@Value("${dir.images}") //injecter une proprieté de fichier application.properties
	private String imageDir;
	
	@Autowired //injecter un objet
	private EtudiantRepository etudiantRepository;
	@RequestMapping(value="/Index")
	public String Index(Model model, @RequestParam(name="page", defaultValue = "0") int p,
			@RequestParam(name="motCle", defaultValue="") String mc) {
		Page<Etudiant> pageEtudiants= etudiantRepository.chercherEtudiants("%"+mc+"%", PageRequest.of(p, 5));
 		int pagesCount= pageEtudiants.getTotalPages();
		int[] pages= new int[pagesCount];
		for(int i=0; i<pagesCount; i++) pages[i]=i;
		model.addAttribute("pages", pages);
		model.addAttribute("pageEtudiants", pageEtudiants);
		model.addAttribute("pageCourante", p);
		model.addAttribute("motCle", mc);
		return "etudiants";
	}
	@RequestMapping(value="/form", method= RequestMethod.GET)
	public String formEtudiant(Model model) {
		model.addAttribute("etudiant", new Etudiant());
		return "formEtudiant";
	}
	@RequestMapping(value="/saveEtudiant", method= RequestMethod.POST)
	public String save(@Valid Etudiant et, BindingResult bindingResult, @RequestParam(name="picture") MultipartFile file) throws IllegalStateException, IOException {
		if(bindingResult.hasErrors()) return "formEtudiant";
		
		if(!(file.isEmpty())) {et.setPhoto(file.getOriginalFilename());}
		etudiantRepository.save(et);
		
		if(!(file.isEmpty())){
			et.setPhoto(file.getOriginalFilename());
			file.transferTo(new File(imageDir+et.getId()));
		}
		
		return "redirect:Index";
	} 
	
	@RequestMapping(value="/getPhoto", produces=MediaType.IMAGE_JPEG_VALUE)
	@ResponseBody
	public byte[] getPhoto(Long id) throws Exception{ // un fichier c'est un tableau de byte.
		File f= new File(imageDir+id);
		return IOUtils.toByteArray(new FileInputStream(f));
	}
	
	@RequestMapping(value="/supprimer")
	public String supprimer(Long id) {
		etudiantRepository.deleteById(id); 
		return "redirect:Index";
	}
	
	@RequestMapping(value="/editer")
	public String editer(Long id, Model model) {
		Etudiant et= etudiantRepository.getOne(id);
		model.addAttribute("etudiant", et);
		return "editEtudiant";
	}
	
	@RequestMapping(value="/UpdateEtudiant", method= RequestMethod.POST)
	public String update(@Valid Etudiant et, BindingResult bindingResult, @RequestParam(name="picture") MultipartFile file) throws IllegalStateException, IOException {
		if(bindingResult.hasErrors()) return "formEtudiant";
		
		if(!(file.isEmpty())) {et.setPhoto(file.getOriginalFilename());}
		etudiantRepository.save(et);
		
		if(!(file.isEmpty())){
			et.setPhoto(file.getOriginalFilename());
			file.transferTo(new File(imageDir+et.getId()));
		}
		
		return "redirect:Index";
	} 

}
