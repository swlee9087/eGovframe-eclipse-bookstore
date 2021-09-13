package shop.cofin.oracle.publishers.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.cofin.oracle.publishers.domain.PublisherDTO;

@Component
public interface PublisherService {
	public List<PublisherDTO> findAll();
	public PublisherDTO findByPubId(int pubId);
	public PublisherDTO findByPubName(String pubName);
	public PublisherDTO findByMgrName(String mgrName);
	public PublisherDTO findByPhone(String phone);
}
