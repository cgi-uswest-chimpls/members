package com.cgi.uswest.chimpls.members.objects;

import java.util.Set;
import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.cgi.uswest.chimpls.members.objects.Member;

public interface MemberRepository extends PagingAndSortingRepository<Member, UUID> {

	Set<Member> findAllByIdprvdorg(@Param("idprvdorg") String idprvdorg);
	
}
