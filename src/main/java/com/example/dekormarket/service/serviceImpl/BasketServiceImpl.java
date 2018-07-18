    package com.example.dekormarket.service.serviceImpl;

    import com.example.dekormarket.dto.BasketRequest;
    import com.example.dekormarket.dto.BasketResponce;
    import com.example.dekormarket.entity.Basket;
    import com.example.dekormarket.repository.BasketRepository;
    import com.example.dekormarket.service.BasketService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    import java.util.List;

    @Service
    public class BasketServiceImpl implements BasketService {

        @Autowired
        private BasketRepository basketRepository;

        @Override
        public BasketResponce save(BasketRequest basketRequest) {
            Basket basket = new Basket();
            basket.setProductName(basketRequest.getProductName());
            basket.setProductPrice(basketRequest.getProductPrice());
            basket.setQuantity(basketRequest.getQuantity());
            basket = basketRepository.save(basket);
            return new BasketResponce(basket);
        }

        @Override
        public List<Basket> findAll() {
            return basketRepository.findAll();
        }

        @Override
        public void delete(Long id) {
            basketRepository.delete(id);
        }
    }
