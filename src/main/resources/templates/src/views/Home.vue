<template>
  <div>
    <b-carousel id="carousel-fade" :interval="2000" fade indicators>
      <b-carousel-slide
        class="img-carousel"
        caption="Enola Homes"
        img-src="https://occ-0-1723-1722.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABeqUW6AKzKbj6S4XMUkai-YyRImRg1LLJVaHpQ_r3_7I_yZaLfkYiXOPTstBmiBMU8w0FdzJDEiqLtlztDG_qeW2TQq2.jpg?r=037"
      ></b-carousel-slide>
      <b-carousel-slide
        class="img-carousel"
        caption="Homem-Aranha: Sem Volta para Casa"
        img-src="https://viciados.net/wp-content/uploads/2021/11/Spider-Man_No_Way_Home_Sem_Volta_Para_Casa_Homem_Aranha_3.webp"
      ></b-carousel-slide>
      <b-carousel-slide
        class="img-carousel"
        caption="The Book Of Boba Fett"
        img-src="https://media-manager.noticiasaominuto.com/1280/naom_6180f841f1af3.jpg?crop_params=eyJsYW5kc2NhcGUiOnsiY3JvcFdpZHRoIjoxODI0LCJjcm9wSGVpZ2h0IjoxMDI2LCJjcm9wWCI6ODUsImNyb3BZIjo0NH0sInBvcnRyYWl0Ijp7ImNyb3BXaWR0aCI6NTk2LCJjcm9wSGVpZ2h0IjoxMDYwLCJjcm9wWCI6NjMwLCJjcm9wWSI6MTJ9fQ=="
      ></b-carousel-slide>
    </b-carousel>
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