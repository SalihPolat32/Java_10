package com.salihpolat.service;

import com.salihpolat.dto.request.PagingRequestDto;
import com.salihpolat.dto.request.UserProfileSaveRequestDto;
import com.salihpolat.mapper.IUserProfileMapper;
import com.salihpolat.repository.IUserProfileRepository;
import com.salihpolat.repository.entity.UserProfile;
import com.salihpolat.utility.ServiceManager;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService extends ServiceManager<UserProfile, Long> {

    private final IUserProfileRepository iUserProfileRepository;

    public UserProfileService(IUserProfileRepository iUserProfileRepository) {

        super(iUserProfileRepository);

        this.iUserProfileRepository = iUserProfileRepository;
    }

    public void saveDto(UserProfileSaveRequestDto dto) {

        /**
         * Eğer userprofileid Daha Önceden Kayıtlıysa, Kaydetmesini Engelle.
         */
        //  if(!iUserProfileRepository.existsUserProfileById(dto.getId()))
        save(IUserProfileMapper.INSTANCE.toUserProfile(dto));
    }

    public Page<UserProfile> findAll(PagingRequestDto dto) {

        Pageable pageable = null;

        Sort sort = null;

        // FIXME "ASC" "DESC" if Kontrolu Yapılacak.
        if (dto.getSortParameter() != null) {
            // Ternary //  ŞART   ? SAĞLANIRSA : SAĞLANMAZSA ;
            String direction = dto.getDirection() == "ASC" ? "ASC" : dto.getDirection();
            sort = Sort.by(Sort.Direction.fromString(direction), dto.getSortParameter());
        }

        // FIXME  if kontrolu yapılacak.
        Integer pageSize = dto.getPageSize() == null ? 10 : dto.getPageSize() < 1 ? 10 : dto.getPageSize();

        // Hem Sıralama Hem de Sayfalama Seçildi.
        if (sort != null && dto.getCurrentPage() != null) {
            pageable = PageRequest.of(dto.getCurrentPage(), pageSize, sort);
        } else if (sort == null && dto.getCurrentPage() != null) {
            pageable = PageRequest.of(dto.getCurrentPage(), pageSize);
        } else {
            pageable = PageRequest.of(0, pageSize);
        }

        return iUserProfileRepository.findAll(pageable);
    }
}