package com.techelevator.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.project.model.Question;
import com.techelevator.project.model.QuestionDao;

@Controller
public class PlayGameController {

	@Autowired
	QuestionDao questionDao;
	
	@RequestMapping(path="/playGame", method=RequestMethod.GET)
	public String playGame(ModelMap modelHolder, @RequestParam(defaultValue="1") int questionNumber){
		Question question = questionDao.getQuestion(questionNumber);
		modelHolder.put("question", question); //blue(left) is JSP and purple(right) is javacode
		return "playGame";
	}
	

	//@RequestMapping(path="/gameResult", method=RequestMethod.GET)
	//
	//}
}

