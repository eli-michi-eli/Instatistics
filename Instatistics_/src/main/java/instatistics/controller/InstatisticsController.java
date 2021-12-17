package instatistics.controller;

import java.text.ParseException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import instatistics.service.*;
/*import instatistics.service.InstatisticsSerivceImpl;
import instatistics.service.InstatisticsService;*/

@RestController
public class InstatisticsController {
@Autowired
private InstatisticsServiceImpl instatisticsService;

//la scrittura in Postman è getDataUser?field=media_type
@RequestMapping(value="/getDataUser")
public ResponseEntity<Object> getDataUser(@RequestParam(name = "field", defaultValue = "media_type") String field) throws ParseException{
	return new ResponseEntity<>(instatisticsService.getDataUser(field),HttpStatus.OK);
} // se faccio piu map cambiando il value mi da errore per usare sempre getdata
  // possiamo trovare un modo per ottenere dalla chiamata il tipo di dato
  // così da avere un map solo
@RequestMapping(value="/getAllUser")
public ResponseEntity<Object> getAllUser() throws ParseException{
	return new ResponseEntity<>(instatisticsService.getAllUser(),HttpStatus.OK);
} 
@RequestMapping(value="/getDataPost")
public ResponseEntity<Object> getDataPost(@RequestParam(name = "field", defaultValue = "media_type") String field) throws ParseException{
	return new ResponseEntity<>(instatisticsService.getDataPost(field),HttpStatus.OK);
} // se faccio piu map cambiando il value mi da errore per usare sempre getdata
  // possiamo trovare un modo per ottenere dalla chiamata il tipo di dato
  // così da avere un map solo
@RequestMapping(value="/getAllPost")
public ResponseEntity<Object> getAllPost() throws ParseException{
	return new ResponseEntity<>(instatisticsService.getAllPost(),HttpStatus.OK);
} 
@RequestMapping(value="/lettura_json")
public ResponseEntity<Object> JsonReading() throws ParseException{
	return new ResponseEntity<>(instatisticsService.JsonReading(),HttpStatus.OK);
} 
@RequestMapping(value="/getMedia")
public ResponseEntity<Object> getMedia(@RequestParam(name = "metod") String metod,@RequestParam(name = "field") String field) throws ParseException{
	return new ResponseEntity<>(instatisticsService.getMedia(metod,field),HttpStatus.OK);
} 
@RequestMapping(value="/getTimestamp")
public ResponseEntity<Object> getTimestamp(@RequestParam(name = "metod") String metod,@RequestParam(name = "field") String field) throws ParseException{
	return new ResponseEntity<>(instatisticsService.getTimestamp(metod,field),HttpStatus.OK);
}

@RequestMapping(value="/getCaption")
public ResponseEntity<Object> getSuggestionOfCaption(@RequestParam(name = "metod") String metod,@RequestParam(name = "field", defaultValue = "null") String field) throws ParseException{
	return new ResponseEntity<>(instatisticsService.getCaption(metod,field),HttpStatus.OK);
}

@RequestMapping(value="/getFilterYear")
public ResponseEntity<Object> getFilterYear(@RequestParam(name = "field", defaultValue = "2021") String field) throws ParseException{
	return new ResponseEntity<>(instatisticsService.getFilterYear(field),HttpStatus.OK);
}





















}
