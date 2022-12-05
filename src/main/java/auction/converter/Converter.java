package auction.converter;

public interface Converter<D, E> {

    D toDto(E e);

    E toEntity(D d);
}
