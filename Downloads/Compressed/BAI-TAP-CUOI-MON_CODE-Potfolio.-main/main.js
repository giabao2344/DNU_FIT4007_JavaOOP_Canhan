    gsap.registerPlugin(ScrollTrigger);
    
    const lenis = new Lenis({
        duration: 1.2, 
        easing: (t) => Math.min(1, 1.001 - Math.pow(2, -10 * t)),
        smoothWheel: true,
        wheelMultiplier: 1, 
    });

  
    lenis.on('scroll', ScrollTrigger.update);

    gsap.ticker.add((time) => {
        lenis.raf(time * 1000);
    });

    gsap.ticker.lagSmoothing(0);

    
    function scrollToSection(targetId) {
        lenis.scrollTo(targetId, {
            offset: -50,
            duration: 2,
            easing: (t) => Math.min(1, 1.001 - Math.pow(2, -10 * t))
        });
    }
    document.addEventListener("DOMContentLoaded", function() {
        const loader = document.getElementById('loader');
        
    
        if (loader) {
            document.body.classList.add('loading');
            runLoaderLogic(); 
        } else {
            
            document.body.classList.remove('loading');
            document.body.style.overflow = 'auto';
            document.body.style.height = 'auto';
            
        
            initAboutAnimations();
        }

    
        initCommonFeatures();
    });


    function runLoaderLogic() {
        const perc = document.getElementById('loader-perc');
        const bar = document.getElementById('loader-bar');
        const loader = document.getElementById('loader');
        let count = { val: 0 };

        gsap.to(count, {
            val: 100, duration: 2, ease: "power4.inOut",
            onUpdate: () => {
                if(perc) perc.innerHTML = Math.floor(count.val).toString().padStart(2, '0');
                if(bar) gsap.set(bar, { xPercent: count.val });
            },
            onComplete: () => {
                gsap.timeline()
                    .to(".loader-content", { opacity: 0, y: -20 })
                    .to(loader, { yPercent: -100, duration: 1, ease: "expo.inOut" })
                    .call(() => {
                        document.body.classList.remove('loading');
                        document.body.style.overflow = 'auto';
                        initAboutAnimations();
                    });
            }
        });
    }


    function initAboutAnimations() {
        gsap.utils.toArray(".reveal-text").forEach((text) => {
            gsap.from(text, {
                scrollTrigger: {
                    trigger: text,
                    start: "top 95%",
                },
                y: 40,
                opacity: 0,
                duration: 1.2,
                ease: "power3.out"
            });
        });

        
        gsap.utils.toArray(".img-container img").forEach((img) => {
            gsap.to(img, {
                scrollTrigger: {
                    trigger: img,
                    start: "top bottom",
                    scrub: true
                },
                scale: 1.1
            });
        });
    }

    function initCommonFeatures() {
        
        const cursor = document.querySelector('.cursor2');
        if (cursor) {
            document.addEventListener('mousemove', (e) => {
                gsap.to(cursor, { x: e.clientX, y: e.clientY, duration: 0.3 });
            });
        }

        
        const timeSpan = document.getElementById('real-time');
        if (timeSpan) {
            setInterval(() => {
                const now = new Date();
                timeSpan.innerText = now.toLocaleTimeString('vi-VN', { hour12: false });
            }, 1000);
        }
    }
    document.addEventListener("DOMContentLoaded", function() {
        
     
        if (window.location.hash === "#work-section") {
            
          
            setTimeout(() => {
                const workSection = document.getElementById('work-section');
                
                if (workSection) {
                    gsap.to(window, {
                        duration: 1.5,
                        scrollTo: {
                            y: workSection,
                            offsetY: 80
                        },
                        ease: "power4.inOut"
                    });
                }
            }, 500); 
        }
    });
