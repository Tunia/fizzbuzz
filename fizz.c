#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>
#include <inttypes.h>
#include <string.h>

const uint32_t a = 2054842694, b = 2054845762;

int main(int argc, char* argv[]) {
  uint64_t max;
  char* answer = alloca(69);
  if(argc != 2) {
badusage:
    fprintf(stderr, "%s: invalid parameter.\n", argv[0]);
    fprintf(stderr, "Usage: %s <max>\n", argv[0]);
    return EXIT_FAILURE;
  }
  if(sscanf(argv[1], " %" SCNu64, &max) != 1) {
    goto badusage; // considered harmful
  }
  for(uint64_t i = UINT64_C(1); i <= max; ++i) {
    answer[0] = '\0';
    if(i % UINT64_C(3) == UINT64_C(0)) {
      strncat(answer, (char*)&a, sizeof(a));
    }
    if(i % UINT64_C(5) == UINT64_C(0)) {
      strncat(answer, (char*)&b, sizeof(b));
    }
    if(answer[0] == '\0') {
      printf("%" PRIu64 "\n", i);
    } else {
      puts(answer);
    }
  }
  return EXIT_SUCCESS;
}
