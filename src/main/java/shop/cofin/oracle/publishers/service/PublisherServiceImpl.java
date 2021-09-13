package shop.cofin.oracle.publishers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.cofin.oracle.publishers.domain.PublisherDTO;
import shop.cofin.oracle.mappers.PublisherMapper;

@Service
public class PublisherServiceImpl implements PublisherService{
	@Autowired PublisherMapper publisherMapper;
	
	@Override
	public List<PublisherDTO> findAll(){
		return publisherMapper.findAll();
	}
	@Override
	public PublisherDTO findByPubId(int pubId) {
		return publisherMapper.findByPubId(pubId);
	};
	@Override
	public PublisherDTO findByPubName(String pubName) {
		return publisherMapper.findByPubName(pubName);
	};
	@Override
	public PublisherDTO findByMgrName(String mgrName) {
		return publisherMapper.findByMgrName(mgrName);
	};
	@Override
	public PublisherDTO findByPhone(String phone) {
		return publisherMapper.findByPhone(phone);
	};
}
