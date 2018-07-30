package com.cgi.uswest.chimpls.members.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.uswest.chimpls.members.objects.Member;
import com.cgi.uswest.chimpls.members.objects.MemberRepository;

@RefreshScope
@RestController
public class MembersApplicationController {

	  @Autowired
	  private MemberRepository repository;
	  
	  @RequestMapping("/membersByProvider/{idprvdorg}")
	  public Set<Member> findPaymentsByProvider(@PathVariable("idprvdorg") String idprvdorg) {
		  return repository.findAllByIdprvdorg(idprvdorg);
	  }
	
}
