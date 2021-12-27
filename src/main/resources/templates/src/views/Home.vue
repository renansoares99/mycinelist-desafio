<template>
  <div>
    <!-- Inicio Carousel -->
    <b-carousel id="carousel-fade" :interval="2500" fade indicators>
      <!-- Inicio Slide -->
      <b-carousel-slide
        class="img-carousel"
        caption="Enola Homes"
        img-src="https://manualgeek.com.br/wp-content/uploads/2020/09/Enola-Holmes.jpg"
      ></b-carousel-slide>

      <b-carousel-slide
        class="img-carousel"
        caption="Homem-Aranha: Sem Volta para Casa"
        img-src="https://viciados.net/wp-content/uploads/2021/11/Spider-Man_No_Way_Home_Sem_Volta_Para_Casa_Homem_Aranha_3.webp"
      ></b-carousel-slide>

      <b-carousel-slide
        class="img-carousel"
        caption="The Book Of Boba Fett"
        img-src="https://assets.b9.com.br/wp-content/uploads/2021/11/6wERdTXVSntT2dSNHewB78DaYV-scaled.jpg"
      ></b-carousel-slide>
      <!-- Fim Slide -->
    </b-carousel>
    <!-- Fim Carousel -->
  </div>
</template>

<script>
export default {
  nome: "Home",
  data() {
    return {};
  },
};
</script>

<style>
.img-carousel {
  width: 100%;
  height: 706px;
}
</style>
