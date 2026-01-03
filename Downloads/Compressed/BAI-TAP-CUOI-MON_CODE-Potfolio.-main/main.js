    gsap.registerPlugin(ScrollTrigger);
    // Khởi tạo Lenis Smooth Scroll
    const lenis = new Lenis({
        duration: 1.2, // Tốc độ cuộn (giây)
        easing: (t) => Math.min(1, 1.001 - Math.pow(2, -10 * t)), // Hàm mượt
        smoothWheel: true,
        wheelMultiplier: 1, // Độ nhạy con lăn
    });

    // Liên kết với GSAP ScrollTrigger
    lenis.on('scroll', ScrollTrigger.update);

    gsap.ticker.add((time) => {
        lenis.raf(time * 1000);
    });

    gsap.ticker.lagSmoothing(0);

    // Nếu bạn cần cuộn đến một mục nào đó mượt hơn (ví dụ mục My Work)
    function scrollToSection(targetId) {
        lenis.scrollTo(targetId, {
            offset: -50,
            duration: 2,
            easing: (t) => Math.min(1, 1.001 - Math.pow(2, -10 * t))
        });
    }
    document.addEventListener("DOMContentLoaded", function() {
        const loader = document.getElementById('loader');
        
        // KIỂM TRA: Nếu có loader (trang chủ) thì mới chặn cuộn và chạy animation
        if (loader) {
            document.body.classList.add('loading');
            runLoaderLogic(); 
        } else {
            // TRANG ABOUT: Không có loader, đảm bảo body sạch sẽ để cuộn
            document.body.classList.remove('loading');
            document.body.style.overflow = 'auto';
            document.body.style.height = 'auto';
            
            // Chạy ngay hiệu ứng hiện chữ
            initAboutAnimations();
        }

        // Khởi tạo các tính năng chung khác
        initCommonFeatures();
    });

    // Hàm dành riêng cho trang chủ (có loader)
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

    // Hàm chạy hiệu ứng hiện chữ và ảnh cho trang About
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

        // Hiệu ứng Zoom nhẹ cho ảnh khi cuộn
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
        // Custom Cursor
        const cursor = document.querySelector('.cursor2');
        if (cursor) {
            document.addEventListener('mousemove', (e) => {
                gsap.to(cursor, { x: e.clientX, y: e.clientY, duration: 0.3 });
            });
        }

        // Real-time Footer
        const timeSpan = document.getElementById('real-time');
        if (timeSpan) {
            setInterval(() => {
                const now = new Date();
                timeSpan.innerText = now.toLocaleTimeString('vi-VN', { hour12: false });
            }, 1000);
        }
    }
    document.addEventListener("DOMContentLoaded", function() {
        
        // Kiểm tra xem URL có chứa "#work-section" không
        if (window.location.hash === "#work-section") {
            
            // Đợi một chút để trang load xong và hiệu ứng chuyển trang hoàn tất
            setTimeout(() => {
                const workSection = document.getElementById('work-section');
                
                if (workSection) {
                    // Dùng GSAP để cuộn mượt mà xuống mục My Work
                    gsap.to(window, {
                        duration: 1.5,
                        scrollTo: {
                            y: workSection,
                            offsetY: 80 // Khoảng cách trừ hao để không bị dính sát mép trên
                        },
                        ease: "power4.inOut"
                    });
                }
            }, 500); // Đợi 0.5s cho hiệu ứng Page Transition trượt đi
        }
    });
